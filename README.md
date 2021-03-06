# UntitledTeam
 
กลุ่มเล็กๆที่รวมตัวกันเพื่อพัฒนาตนเองในวิชา SOP - Service Oriented Programming

# สมาชิกกลุ่ม

1. 61070068 นายธนกฤต แซ่ลี้ - Project Manager, Full-Stack developer
    - ช่วยดูแลการทำโปรเจกให้เป็นไปตามความเรียบร้อย
    - มอบหมายงานที่ถูกต้องแก่คนในทีม
    - ทำโปรแกรมตามที่วางแผนไว้

2. 61070014 นายกิตติพศ ละอองศรี - Front-end Developer
    - เขียนappส่วนหน้าที่ติดต่อกับผู้ใช้งานตามที่วางแผนไว้
    - แลกแปลี่ยนความรู้กับคนในทีมเผื่อเพื่มประสิทธิภาพในการทำงาน

3. 61070201 นายวรรณมงคล ศรีวรรณ์  - Front-end Developer
    - เขียนappส่วนหน้าที่ติดต่อกับผู้ใช้งานตามที่วางแผนไว้
    - แลกแปลี่ยนความรู้กับคนในทีมเผื่อเพื่มประสิทธิภาพในการทำงาน
  
4. 61070006 นายกฤษฎาภา ง่วนจร  - Back-end Developer
    - เขียนappส่วนหลังบ้านตามที่วางแผนเอาไว้
    - เลือกใช้toolsให้เหมาะสมกับงาน
    - รักษาความปลอดภัยในการใช้งานapp
 
 5. 61070043 นางสาวฐานิดา สำเนียง - UI/UX Designer
	- ออกแบบหน้าต่างการใช้งานให้เหมาะสม ใช้งานง่าย
	- ออกแบบappนั้นสรา้งประสบการณ์การใช้งานที่ดีต่อผู้ใช้
 
 6. 61070190 นางสาวรุ่งวราพร คุตะนนท์ - UI/UX Designer
	- ออกแบบหน้าต่างการใช้งานให้เหมาะสม ใช้งานง่าย
	- ออกแบบappนั้นสรา้งประสบการณ์การใช้งานที่ดีต่อผู้ใช้

# Concept App พื้นที่สนทนาของนักศึกษาในคณะIT

นักศึกษาสามารถใช้งานแอพในการสร้างห้องสนทนาของแต่ละวิชาเพื่อพูดคุยกันในระหว่างสอน หรือหลังการสอนจบไปแล้ว และยังสามารถสามารถอัพโหลดและแชร์โน๊ตของแต่ละคนให้คนอื่นในกลุ่มสนทนาได้ โดยฟิเจอร์โดยคร่าวๆจะมีดังนี้
 - ระบบสร้างห้องสนทนา ของแต่ละรายวิชา โพสได้ คอมเม้นท์ได้ upvote ข้อความที่เป็นประโยชน์ได้
 - ระบบโปรไฟล์
 - ระบบแชท
 - ระบบตั้งถาม/โพล 
 - ระบบอัพโหลดไลฟ์เอกสาร/รูปภาพ
 - ระบบตารางเรียน
 
# JSON
JSON ย่อมาจาก JavaScript Object Notation เป็น ฟอแมตยอดนิยมในการส่งข้อมูล ณ ปัจจุบัน มีโครงสร้างที่ไม่ซับซ้อน อ่านง่าย นิยมใช้ในการส่งข้อมูลจากเว็บเซิฟเวอร์ไปยังหน้าเว็บเพจ

### ตัวอย่างข้อมูล JSON
```json
{
   "Student" : [
	   "Firstname": "Alex",
	   "Lastname": "Watson",
	   "Age": 25,
   ]
}
```
จะเห็นได้ว่าข้อมูลจะเป็นแบบ Key - Value และมีการแบ่งช่วงข้อมูลโดยใช้เครื่องหมาย comma (" , ")
### จุดเด่นของJSON
- ง่ายต่อการสร้าง Applications Program Interface (API)
- รองรับได้ทุกบราวเซอร์อย่างดีเยี่ยม
- มีไลบรารีหรือเครื่องมือสนับสนุน เช่น AJAX, JavaScript libraries
- อ่านง่ายเขียนง่าย ทำงานได้เร็วกว่า
### จุดด้อยของJSON
- ไม่มี namespace แบบ XML
