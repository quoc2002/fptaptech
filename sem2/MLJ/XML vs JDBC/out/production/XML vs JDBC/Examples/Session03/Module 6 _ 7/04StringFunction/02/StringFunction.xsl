<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <body>
      <h3>String functions</h3>
	    <ul>
          <li><b>translate('Bboks','bok','ook')</b> = 
            <xsl:value-of select = "translate('Bboks','bok','ook')"/>
	      </li>	
          <li><b>concat('Nguyen Cong ','Hoan')</b> = 
            <xsl:value-of select = "concat('Nguyen Cong ','Hoan')"/>
	      </li>	
          <li><b>contains('Hoa binh','bi')</b> = 
            <xsl:value-of select = "contains('Hoa binh','bi')"/>
	      </li>	
        </ul>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
