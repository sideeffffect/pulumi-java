// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDatabaseInstanceServerCaCert {
    private final String cert;
    private final String commonName;
    private final String createTime;
    private final String expirationTime;
    private final String sha1Fingerprint;

    @OutputCustomType.Constructor
    private GetDatabaseInstanceServerCaCert(
        @OutputCustomType.Parameter("cert") String cert,
        @OutputCustomType.Parameter("commonName") String commonName,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("expirationTime") String expirationTime,
        @OutputCustomType.Parameter("sha1Fingerprint") String sha1Fingerprint) {
        this.cert = cert;
        this.commonName = commonName;
        this.createTime = createTime;
        this.expirationTime = expirationTime;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    public String getCert() {
        return this.cert;
    }
    public String getCommonName() {
        return this.commonName;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public String getExpirationTime() {
        return this.expirationTime;
    }
    public String getSha1Fingerprint() {
        return this.sha1Fingerprint;
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
        }
        public GetDatabaseInstanceServerCaCert build() {
            return new GetDatabaseInstanceServerCaCert(cert, commonName, createTime, expirationTime, sha1Fingerprint);
        }
    }
}
