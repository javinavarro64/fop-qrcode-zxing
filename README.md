This is an updated version of the library working with Java 8+. It has been tested with Java 11 and Java 17.

## Dependencies

* Apache FOP http://xmlgraphics.apache.org/fop
* ZXing ("Zebra Crossing") https://github.com/zxing/zxing

## Usage

Put fop-zxing-1.0.0-SNAPSHOT-jar-with-dependencies.jar in the FOP classpath. Add the QRCode snippet to your XSL:

```xml
	<qr:qr-code xmlns:qr="http://hobbut.ru/fop/qr-code/"
		width="10cm" correction="l" message="Hello, Zxing!">
```

### Parameters

* __width__ - Width of qr-code. Can be in mm, pt, in, cm. Default: 50mm
* __correction__ - type of correction. Can be l, m, q, h. Deafult: l
* __encoding__ - Message encoding. Default:ISO-8859-1
* __message__ - Message to encode

### Sample

https://github.com/javinavarro64/fop-qrcode-zxing/blob/master/src/test/resources/sample.xml
