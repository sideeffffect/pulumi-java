// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceServerCaCertGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceServerCaCertGetArgs Empty = new InstanceServerCaCertGetArgs();

    @Import(name="cert")
      private final @Nullable Output<String> cert;

    public Output<String> cert() {
        return this.cert == null ? Codegen.empty() : this.cert;
    }

    /**
     * - 
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    @Import(name="expireTime")
      private final @Nullable Output<String> expireTime;

    public Output<String> expireTime() {
        return this.expireTime == null ? Codegen.empty() : this.expireTime;
    }

    @Import(name="serialNumber")
      private final @Nullable Output<String> serialNumber;

    public Output<String> serialNumber() {
        return this.serialNumber == null ? Codegen.empty() : this.serialNumber;
    }

    @Import(name="sha1Fingerprint")
      private final @Nullable Output<String> sha1Fingerprint;

    public Output<String> sha1Fingerprint() {
        return this.sha1Fingerprint == null ? Codegen.empty() : this.sha1Fingerprint;
    }

    public InstanceServerCaCertGetArgs(
        @Nullable Output<String> cert,
        @Nullable Output<String> createTime,
        @Nullable Output<String> expireTime,
        @Nullable Output<String> serialNumber,
        @Nullable Output<String> sha1Fingerprint) {
        this.cert = cert;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.serialNumber = serialNumber;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    private InstanceServerCaCertGetArgs() {
        this.cert = Codegen.empty();
        this.createTime = Codegen.empty();
        this.expireTime = Codegen.empty();
        this.serialNumber = Codegen.empty();
        this.sha1Fingerprint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceServerCaCertGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cert;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> expireTime;
        private @Nullable Output<String> serialNumber;
        private @Nullable Output<String> sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceServerCaCertGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder cert(@Nullable Output<String> cert) {
            this.cert = cert;
            return this;
        }
        public Builder cert(@Nullable String cert) {
            this.cert = Codegen.ofNullable(cert);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder expireTime(@Nullable Output<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Builder expireTime(@Nullable String expireTime) {
            this.expireTime = Codegen.ofNullable(expireTime);
            return this;
        }
        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Builder serialNumber(@Nullable String serialNumber) {
            this.serialNumber = Codegen.ofNullable(serialNumber);
            return this;
        }
        public Builder sha1Fingerprint(@Nullable Output<String> sha1Fingerprint) {
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }
        public Builder sha1Fingerprint(@Nullable String sha1Fingerprint) {
            this.sha1Fingerprint = Codegen.ofNullable(sha1Fingerprint);
            return this;
        }        public InstanceServerCaCertGetArgs build() {
            return new InstanceServerCaCertGetArgs(cert, createTime, expireTime, serialNumber, sha1Fingerprint);
        }
    }
}
