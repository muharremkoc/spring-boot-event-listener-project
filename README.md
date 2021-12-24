# spring-boot-event-listener-project

Event Listeners are the listeners developed to listen to the event in case of any event.
Let's look at the important concepts we need to know before moving on to the Event Listener process.

• Event Source: It is the component, service, class where the event occurred.

• Event Object: It is the object affected by the event and holding information about the event.

• Event Listeners: These are the listeners who are informed when the event occurs.

• Event Handlers: This is where the code caught by the listener is executed.

----
Exp:
  
  Now, let's create an Email Sending project and examine the Event Listener process.

- First, let's create our Event Object.
 
 ![image](https://user-images.githubusercontent.com/80245013/147348938-60333bc7-f238-43a8-873c-31234ef330f6.png)

 
- Secondly, the Event We Will Perform (Let's define the event)

![image](https://user-images.githubusercontent.com/80245013/147348949-94192cb0-48da-4d8a-8541-50e5c0e685f3.png)

 
As in the figure, we define a source and an object in our event.

- When we come to the third stage, let's create our source structure what this event is and how the event source will be affected by this situation.

![image](https://user-images.githubusercontent.com/80245013/147348959-cdbfc032-3e5e-4bbb-a647-9cc89453e5aa.png)

 
- Our fourth and final stage is the listening stage. Let's examine this stage in two parts.


![image](https://user-images.githubusercontent.com/80245013/147348979-bd5efa16-9005-49cd-877d-ffdba5d18db2.png)

 
1) Synchronous(Simultaneous operation)

![image](https://user-images.githubusercontent.com/80245013/147348998-9b6dacc6-0768-47c9-b6b5-ccd4a6a10ff3.png)

 
2)Asynchronous(Asynchronous operation)


![image](https://user-images.githubusercontent.com/80245013/147349004-01a7d9db-8057-4754-9371-0f51d4e9f94d.png)


 
If we do not use the @Order annotation in these methods, the priority order is determined as our main program wants, and the listeners do not work sequentially.


![image](https://user-images.githubusercontent.com/80245013/147349282-85c6040b-1921-463e-8696-c230521e2f09.png)

 

 When we define @Order annotation, Listeners work as we set, not our main program.
 

![image](https://user-images.githubusercontent.com/80245013/147349298-4339eb65-2fa4-43fd-b832-e7b5ac3802f6.png)


![image](https://user-images.githubusercontent.com/80245013/147349302-886fd1b2-13b7-4b5a-8b51-0ceec3585619.png)


![image](https://user-images.githubusercontent.com/80245013/147349308-ee7cd974-09f8-4072-9a97-d660b10efa22.png)


![image](https://user-images.githubusercontent.com/80245013/147349316-77c90269-6c26-4873-bfa2-a55d6e1d5e3c.png)


## Owner
[Muharrem Koç](https://github.com/muharremkoc)
