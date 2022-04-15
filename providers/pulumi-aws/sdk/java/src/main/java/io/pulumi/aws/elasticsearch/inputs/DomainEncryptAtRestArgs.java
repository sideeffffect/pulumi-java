// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainEncryptAtRestArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainEncryptAtRestArgs Empty = new DomainEncryptAtRestArgs();

    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    public DomainEncryptAtRestArgs(
        Output<Boolean> enabled,
        @Nullable Output<String> kmsKeyId) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.kmsKeyId = kmsKeyId;
    }

    private DomainEncryptAtRestArgs() {
        this.enabled = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEncryptAtRestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabled;
        private @Nullable Output<String> kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEncryptAtRestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }        public DomainEncryptAtRestArgs build() {
            return new DomainEncryptAtRestArgs(enabled, kmsKeyId);
        }
    }
}
