// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.oslogin_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSshPublicKeyResult {
    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    private final String expirationTimeUsec;
    /**
     * The SHA-256 fingerprint of the SSH public key.
     * 
     */
    private final String fingerprint;
    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    private final String key;
    /**
     * The canonical resource name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"expirationTimeUsec","fingerprint","key","name"})
    private GetSshPublicKeyResult(
        String expirationTimeUsec,
        String fingerprint,
        String key,
        String name) {
        this.expirationTimeUsec = expirationTimeUsec;
        this.fingerprint = fingerprint;
        this.key = key;
        this.name = name;
    }

    /**
     * An expiration time in microseconds since epoch.
     * 
    */
    public String getExpirationTimeUsec() {
        return this.expirationTimeUsec;
    }
    /**
     * The SHA-256 fingerprint of the SSH public key.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The canonical resource name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSshPublicKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTimeUsec;
        private String fingerprint;
        private String key;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSshPublicKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTimeUsec = defaults.expirationTimeUsec;
    	      this.fingerprint = defaults.fingerprint;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder setExpirationTimeUsec(String expirationTimeUsec) {
            this.expirationTimeUsec = Objects.requireNonNull(expirationTimeUsec);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetSshPublicKeyResult build() {
            return new GetSshPublicKeyResult(expirationTimeUsec, fingerprint, key, name);
        }
    }
}
