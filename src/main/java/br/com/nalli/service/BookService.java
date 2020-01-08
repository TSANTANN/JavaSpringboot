package br.com.nalli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nalli.converter.DozerConverter;
import br.com.nalli.data.model.Book;
import br.com.nalli.data.vo.BookVO;
import br.com.nalli.exception.ResourceNotFoundException;
import br.com.nalli.repository.BookRepository;

@Service
public class BookService {



		@Autowired
		BookRepository repository;
		
		public BookVO crate(BookVO book) {
			Book entity = DozerConverter.parseObject(book, Book.class);
			BookVO vo = DozerConverter.parseObject(repository.save(entity), BookVO.class);
			return vo;
		}
		
		public List<BookVO> findAll() {
			
			return DozerConverter.parseListObjects(repository.findAll(), BookVO.class);		
		}
		
		public BookVO findById(Long id) {
			
			Book entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID") );
			return DozerConverter.parseObject(entity, BookVO.class);
		}
			
		public BookVO update(BookVO book) {
			Book entity = repository.findById(book.getKey())
					.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));		
			
			entity.setAuthor(book.getAuthor());
			entity.setLaunch_date(book.getLaunch_date());
			entity.setPrice(book.getPrice());
			entity.setTitle(book.getTitle());
			
			BookVO vo = DozerConverter.parseObject(repository.save(entity), BookVO.class);
			return vo;		
			
		}
		
		public void delete(Long id) {
			Book entity = repository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));	
			
			repository.delete(entity);
		}	
		
		
	}
