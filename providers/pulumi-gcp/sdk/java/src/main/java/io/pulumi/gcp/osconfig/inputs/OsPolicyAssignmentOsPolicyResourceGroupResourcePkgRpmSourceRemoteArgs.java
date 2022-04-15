// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs();

    /**
     * SHA256 checksum of the remote file.
     * 
     */
    @Import(name="sha256Checksum")
      private final @Nullable Output<String> sha256Checksum;

    public Output<String> sha256Checksum() {
        return this.sha256Checksum == null ? Codegen.empty() : this.sha256Checksum;
    }

    /**
     * Required. URI for this repository.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs(
        @Nullable Output<String> sha256Checksum,
        Output<String> uri) {
        this.sha256Checksum = sha256Checksum;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs() {
        this.sha256Checksum = Codegen.empty();
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> sha256Checksum;
        private Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.uri = defaults.uri;
        }

        public Builder sha256Checksum(@Nullable Output<String> sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }
        public Builder sha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = Codegen.ofNullable(sha256Checksum);
            return this;
        }
        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs(sha256Checksum, uri);
        }
    }
}
