package com.gustavoVictorio.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gustavoVictorio.dslearnbds.dto.NotificationDTO;
import com.gustavoVictorio.dslearnbds.entities.Notification;
import com.gustavoVictorio.dslearnbds.entities.User;
import com.gustavoVictorio.dslearnbds.repositories.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository repository;

	@Autowired
	private AuthService authservice;

	public Page<NotificationDTO> notificationForCurrentUser(boolean unreadOnly, Pageable pageable) {
		User user = authservice.authenticated();
		Page<Notification> page = repository.find(user, unreadOnly, pageable);
		return page.map(x -> new NotificationDTO(x));
		
	}

}
