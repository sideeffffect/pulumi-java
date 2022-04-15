// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseInstanceServerCaCert extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceServerCaCert Empty = new GetDatabaseInstanceServerCaCert();

    @Import(name="cert", required=true)
      private final String cert;

    public String cert() {
        return this.cert;
    }

    @Import(name="commonName", required=true)
      private final String commonName;

    public String commonName() {
        return this.commonName;
    }

    @Import(name="createTime", required=true)
      private final String createTime;

    public String createTime() {
        return this.createTime;
    }

    @Import(name="expirationTime", required=true)
      private final String expirationTime;

    public String expirationTime() {
        return this.expirationTime;
    }

    @Import(name="sha1Fingerprint", required=true)
      private final String sha1Fingerprint;

    public String sha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public GetDatabaseInstanceServerCaCert(
        String cert,
        String commonName,
        String createTime,
        String expirationTime,
        String sha1Fingerprint) {
        this.cert = Objects.requireNonNull(cert, "expected parameter 'cert' to be non-null");
        this.commonName = Objects.requireNonNull(commonName, "expected parameter 'commonName' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.expirationTime = Objects.requireNonNull(expirationTime, "expected parameter 'expirationTime' to be non-null");
        this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint, "expected parameter 'sha1Fingerprint' to be non-null");
    }

    private GetDatabaseInstanceServerCaCert() {
        this.cert = null;
        this.commonName = null;
        this.createTime = null;
        this.expirationTime = null;
        this.sha1Fingerprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceServerCaCert defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cert;
        private String commonName;
        private String createTime;
        private String expirationTime;
        private String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceServerCaCert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.commonName = defaults.commonName;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder cert(String cert) {
            this.cert = Objects.requireNonNull(cert);
            return this;
        }
        public Builder commonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder sha1Fingerprint(String sha1Fingerprint) {
            this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint);
            return this;
        }        public GetDatabaseInstanceServerCaCert build() {
            return new GetDatabaseInstanceServerCaCert(cert, commonName, createTime, expirationTime, sha1Fingerprint);
        }
    }
}
