package sandbox.oleksii.project.metadata.certs;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="Certificate")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class CertsMetaPojo extends XmlPojoEntity {

    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    @Element
    private Boolean caSigned;

    @Element
    private Boolean encryptedWithPlatformEncryption;

    private Date expirationDate;

    @Element
    private Integer keySize;

    @Element
    private String masterLabel;

    @Element
    private Boolean privateKeyExportable;

    public CertsMetaPojo() {
    }

    @Element(name = "expirationDate")
    public void setExpirationDate(String unformattedDate) {
        DateFormat df = new SimpleDateFormat(DATE_TIME_FORMAT);
        Date parsed = null;
        try {
            parsed = df.parse(unformattedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.expirationDate = parsed;
    }

    @Element(name = "expirationDate")
    public String getExpirationDate() {
        DateFormat df = new SimpleDateFormat(DATE_TIME_FORMAT);
        return df.format(expirationDate);
    }

    @Override
    public String toString() {
        return "CertsMetaPojo{" +
                "caSigned=" + caSigned +
                ", encryptedWithPlatformEncryption=" + encryptedWithPlatformEncryption +
                ", expirationDate=" + expirationDate +
                ", keySize=" + keySize +
                ", masterLabel='" + masterLabel + '\'' +
                ", privateKeyExportable=" + privateKeyExportable +
                '}';
    }
}
