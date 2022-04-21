// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs();

    /**
     * Required. Bucket of the Cloud Storage object.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<Integer> generation;

    public Optional<Output<Integer>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * Required. Name of the Cloud Storage object.
     * 
     */
    @Import(name="object", required=true)
    private Output<String> object;

    public Output<String> object() {
        return this.object;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder generation(@Nullable Output<Integer> generation) {
            $.generation = generation;
            return this;
        }

        public Builder generation(Integer generation) {
            return generation(Output.of(generation));
        }

        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        public Builder object(String object) {
            return object(Output.of(object));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsGetArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
