// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBucketIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketIamPolicyArgs Empty = new GetBucketIamPolicyArgs();

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="userProject")
    private @Nullable Output<String> userProject;

    public Optional<Output<String>> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    private GetBucketIamPolicyArgs() {}

    private GetBucketIamPolicyArgs(GetBucketIamPolicyArgs $) {
        this.bucket = $.bucket;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.userProject = $.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBucketIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBucketIamPolicyArgs $;

        public Builder() {
            $ = new GetBucketIamPolicyArgs();
        }

        public Builder(GetBucketIamPolicyArgs defaults) {
            $ = new GetBucketIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder userProject(@Nullable Output<String> userProject) {
            $.userProject = userProject;
            return this;
        }

        public Builder userProject(String userProject) {
            return userProject(Output.of(userProject));
        }

        public GetBucketIamPolicyArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
