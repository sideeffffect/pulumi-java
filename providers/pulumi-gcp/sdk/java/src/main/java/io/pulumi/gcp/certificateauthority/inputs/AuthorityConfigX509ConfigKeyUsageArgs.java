// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigKeyUsageArgs Empty = new AuthorityConfigX509ConfigKeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="baseKeyUsage", required=true)
      private final Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage;

    public Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage() {
        return this.baseKeyUsage;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="extendedKeyUsage", required=true)
      private final Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;

    public Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage() {
        return this.extendedKeyUsage;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    @Import(name="unknownExtendedKeyUsages")
      private final @Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

    public Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Codegen.empty() : this.unknownExtendedKeyUsages;
    }

    public AuthorityConfigX509ConfigKeyUsageArgs(
        Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage,
        Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage,
        @Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage, "expected parameter 'baseKeyUsage' to be non-null");
        this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage, "expected parameter 'extendedKeyUsage' to be non-null");
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private AuthorityConfigX509ConfigKeyUsageArgs() {
        this.baseKeyUsage = Codegen.empty();
        this.extendedKeyUsage = Codegen.empty();
        this.unknownExtendedKeyUsages = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage;
        private Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;
        private @Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder baseKeyUsage(Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }
        public Builder baseKeyUsage(AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs baseKeyUsage) {
            this.baseKeyUsage = Output.of(Objects.requireNonNull(baseKeyUsage));
            return this;
        }
        public Builder extendedKeyUsage(Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }
        public Builder extendedKeyUsage(AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs extendedKeyUsage) {
            this.extendedKeyUsage = Output.of(Objects.requireNonNull(extendedKeyUsage));
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Codegen.ofNullable(unknownExtendedKeyUsages);
            return this;
        }
        public Builder unknownExtendedKeyUsages(AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }        public AuthorityConfigX509ConfigKeyUsageArgs build() {
            return new AuthorityConfigX509ConfigKeyUsageArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
