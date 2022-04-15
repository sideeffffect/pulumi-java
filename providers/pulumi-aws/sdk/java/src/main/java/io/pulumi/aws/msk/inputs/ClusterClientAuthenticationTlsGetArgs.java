// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClientAuthenticationTlsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClientAuthenticationTlsGetArgs Empty = new ClusterClientAuthenticationTlsGetArgs();

    /**
     * List of ACM Certificate Authority Amazon Resource Names (ARNs).
     * 
     */
    @Import(name="certificateAuthorityArns")
      private final @Nullable Output<List<String>> certificateAuthorityArns;

    public Output<List<String>> certificateAuthorityArns() {
        return this.certificateAuthorityArns == null ? Codegen.empty() : this.certificateAuthorityArns;
    }

    public ClusterClientAuthenticationTlsGetArgs(@Nullable Output<List<String>> certificateAuthorityArns) {
        this.certificateAuthorityArns = certificateAuthorityArns;
    }

    private ClusterClientAuthenticationTlsGetArgs() {
        this.certificateAuthorityArns = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientAuthenticationTlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> certificateAuthorityArns;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClientAuthenticationTlsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArns = defaults.certificateAuthorityArns;
        }

        public Builder certificateAuthorityArns(@Nullable Output<List<String>> certificateAuthorityArns) {
            this.certificateAuthorityArns = certificateAuthorityArns;
            return this;
        }
        public Builder certificateAuthorityArns(@Nullable List<String> certificateAuthorityArns) {
            this.certificateAuthorityArns = Codegen.ofNullable(certificateAuthorityArns);
            return this;
        }
        public Builder certificateAuthorityArns(String... certificateAuthorityArns) {
            return certificateAuthorityArns(List.of(certificateAuthorityArns));
        }        public ClusterClientAuthenticationTlsGetArgs build() {
            return new ClusterClientAuthenticationTlsGetArgs(certificateAuthorityArns);
        }
    }
}
