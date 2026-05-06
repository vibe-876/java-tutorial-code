(cua-mode 1)

(global-set-key (kbd "C-o") 'find-file)
(global-set-key (kbd "C-b") 'switch-buffer)
(global-set-key (kbd "<f5>") (lambda ()
			       (compile ".\gradlew.bat runClient")))
(global-set-key (kbd "<f6>") #'compile)

(load-theme 'deeper-blue t)
