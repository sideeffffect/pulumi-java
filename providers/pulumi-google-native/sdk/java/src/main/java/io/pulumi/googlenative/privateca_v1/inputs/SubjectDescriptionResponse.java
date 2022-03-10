// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectAltNamesResponse;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectResponse;
import java.lang.String;
import java.util.Objects;


/**
 * These values describe fields in an issued X.509 certificate such as the distinguished name, subject alternative names, serial number, and lifetime.
 * 
 */
public final class SubjectDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubjectDescriptionResponse Empty = new SubjectDescriptionResponse();

    /**
     * The serial number encoded in lowercase hexadecimal.
     * 
     */
    @InputImport(name="hexSerialNumber", required=true)
      private final String hexSerialNumber;

    public String getHexSerialNumber() {
        return this.hexSerialNumber;
    }

    /**
     * For convenience, the actual lifetime of an issued certificate.
     * 
     */
    @InputImport(name="lifetime", required=true)
      private final String lifetime;

    public String getLifetime() {
        return this.lifetime;
    }

    /**
     * The time after which the certificate is expired. Per RFC 5280, the validity period for a certificate is the period of time from not_before_time through not_after_time, inclusive. Corresponds to 'not_before_time' + 'lifetime' - 1 second.
     * 
     */
    @InputImport(name="notAfterTime", required=true)
      private final String notAfterTime;

    public String getNotAfterTime() {
        return this.notAfterTime;
    }

    /**
     * The time at which the certificate becomes valid.
     * 
     */
    @InputImport(name="notBeforeTime", required=true)
      private final String notBeforeTime;

    public String getNotBeforeTime() {
        return this.notBeforeTime;
    }

    /**
     * Contains distinguished name fields such as the common name, location and / organization.
     * 
     */
    @InputImport(name="subject", required=true)
      private final SubjectResponse subject;

    public SubjectResponse getSubject() {
        return this.subject;
    }

    /**
     * The subject alternative name fields.
     * 
     */
    @InputImport(name="subjectAltName", required=true)
      private final SubjectAltNamesResponse subjectAltName;

    public SubjectAltNamesResponse getSubjectAltName() {
        return this.subjectAltName;
    }

    public SubjectDescriptionResponse(
        String hexSerialNumber,
        String lifetime,
        String notAfterTime,
        String notBeforeTime,
        SubjectResponse subject,
        SubjectAltNamesResponse subjectAltName) {
        this.hexSerialNumber = Objects.requireNonNull(hexSerialNumber, "expected parameter 'hexSerialNumber' to be non-null");
        this.lifetime = Objects.requireNonNull(lifetime, "expected parameter 'lifetime' to be non-null");
        this.notAfterTime = Objects.requireNonNull(notAfterTime, "expected parameter 'notAfterTime' to be non-null");
        this.notBeforeTime = Objects.requireNonNull(notBeforeTime, "expected parameter 'notBeforeTime' to be non-null");
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.subjectAltName = Objects.requireNonNull(subjectAltName, "expected parameter 'subjectAltName' to be non-null");
    }

    private SubjectDescriptionResponse() {
        this.hexSerialNumber = null;
        this.lifetime = null;
        this.notAfterTime = null;
        this.notBeforeTime = null;
        this.subject = null;
        this.subjectAltName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hexSerialNumber;
        private String lifetime;
        private String notAfterTime;
        private String notBeforeTime;
        private SubjectResponse subject;
        private SubjectAltNamesResponse subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hexSerialNumber = defaults.hexSerialNumber;
    	      this.lifetime = defaults.lifetime;
    	      this.notAfterTime = defaults.notAfterTime;
    	      this.notBeforeTime = defaults.notBeforeTime;
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder hexSerialNumber(String hexSerialNumber) {
            this.hexSerialNumber = Objects.requireNonNull(hexSerialNumber);
            return this;
        }

        public Builder lifetime(String lifetime) {
            this.lifetime = Objects.requireNonNull(lifetime);
            return this;
        }

        public Builder notAfterTime(String notAfterTime) {
            this.notAfterTime = Objects.requireNonNull(notAfterTime);
            return this;
        }

        public Builder notBeforeTime(String notBeforeTime) {
            this.notBeforeTime = Objects.requireNonNull(notBeforeTime);
            return this;
        }

        public Builder subject(SubjectResponse subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder subjectAltName(SubjectAltNamesResponse subjectAltName) {
            this.subjectAltName = Objects.requireNonNull(subjectAltName);
            return this;
        }
        public SubjectDescriptionResponse build() {
            return new SubjectDescriptionResponse(hexSerialNumber, lifetime, notAfterTime, notBeforeTime, subject, subjectAltName);
        }
    }
}
