// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.inputs;

import io.pulumi.awsnative.ssm.inputs.AssociationS3OutputLocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssociationInstanceAssociationOutputLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssociationInstanceAssociationOutputLocationArgs Empty = new AssociationInstanceAssociationOutputLocationArgs();

    @InputImport(name="s3Location")
      private final @Nullable Input<AssociationS3OutputLocationArgs> s3Location;

    public Input<AssociationS3OutputLocationArgs> getS3Location() {
        return this.s3Location == null ? Input.empty() : this.s3Location;
    }

    public AssociationInstanceAssociationOutputLocationArgs(@Nullable Input<AssociationS3OutputLocationArgs> s3Location) {
        this.s3Location = s3Location;
    }

    private AssociationInstanceAssociationOutputLocationArgs() {
        this.s3Location = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationInstanceAssociationOutputLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AssociationS3OutputLocationArgs> s3Location;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationInstanceAssociationOutputLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Location = defaults.s3Location;
        }

        public Builder s3Location(@Nullable Input<AssociationS3OutputLocationArgs> s3Location) {
            this.s3Location = s3Location;
            return this;
        }

        public Builder s3Location(@Nullable AssociationS3OutputLocationArgs s3Location) {
            this.s3Location = Input.ofNullable(s3Location);
            return this;
        }
        public AssociationInstanceAssociationOutputLocationArgs build() {
            return new AssociationInstanceAssociationOutputLocationArgs(s3Location);
        }
    }
}
