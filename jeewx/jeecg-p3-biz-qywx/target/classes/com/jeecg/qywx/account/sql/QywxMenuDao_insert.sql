INSERT  INTO
	qywx_menu
      ( 
      ID                            
      ,agent_id                       
      ,menu_name                      
      ,menu_type                      
      ,menu_key                       
      ,orders                         
      ,msg_type                       
      ,template_id                     
      ,url                            
      ,father_id                      
      ,create_name                    
      ,create_by                      
      ,create_date                    
      ,update_name                    
      ,update_by                      
      ,update_date                    
      ) 
values
      (
      :qywxMenu.id                            
      ,:qywxMenu.agentId                       
      ,:qywxMenu.menuName                      
      ,:qywxMenu.menuType                      
      ,:qywxMenu.menuKey                       
      ,:qywxMenu.orders                        
      ,:qywxMenu.msgType                       
      ,:qywxMenu.templateId                    
      ,:qywxMenu.url                           
      ,:qywxMenu.fatherId                     
      ,:qywxMenu.createName                    
      ,:qywxMenu.createBy                      
      ,:qywxMenu.createDate                    
      ,:qywxMenu.updateName                    
      ,:qywxMenu.updateBy                      
      ,:qywxMenu.updateDate                    
      )