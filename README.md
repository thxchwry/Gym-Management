# Gym Management System 🏋️‍♂️💪

โปรเจกต์นี้เป็นระบบบริหารจัดการฟิตเนสและโรงยิม (Gym Management) ที่พัฒนาด้วยภาษา **Java** โดยใช้ **Java Swing** สำหรับหน้าจอส่วนติดต่อผู้ใช้ (GUI) และใช้การจัดเก็บข้อมูลผ่านไฟล์ข้อความ (Text-based Database) เพื่อรองรับการลงทะเบียนและจองคลาสออกกำลังกาย

---

## 🔍 ภาพรวมของโปรเจกต์


โปรเจกต์นี้เน้นการฝึกฝนเรื่องการออกแบบ **Multi-frame UI**, การจัดการระบบ **Member Authentication** และการใช้ **File I/O** ในการจัดการข้อมูลพื้นฐาน

---

## 🛠️ เทคโนโลยีที่ใช้

- **Language**: Java 8+
- **GUI Framework**: Java Swing / AWT
- **IDE**: NetBeans / Apache NetBeans
- **Data Storage**: Text Files (.txt) for User Data
- **Graphics**: Icon & Image integration for modern UI

---

## 📂 โครงสร้างโปรเจกต์โดยย่อ

```text
gym-management/
├── src/gym/
│   ├── Loginnnnn.java       # หน้าจอเข้าสู่ระบบ
│   ├── Signup.java          # ระบบลงทะเบียนสมาชิกใหม่
│   ├── Menuuuuu.java        # เมนูหลัก (Dashboard)
│   ├── Booking.java         # ระบบเลือกจองคลาสออกกำลังกาย
│   ├── Yoga/Pilates/Boxing.java # โมดูลจัดการคลาสแต่ละประเภท
│   └── Enquire.java         # ระบบตรวจสอบข้อมูลสมาชิก/สอบถาม
├── User/
│   └── Customerinformation.txt # ฐานข้อมูลจำลองสำหรับเก็บข้อมูลสมาชิก
├── build.xml                # ไฟล์สำหรับการ Build ด้วย Ant
└── README.md                # ไฟล์อธิบายโปรเจกต์
```

