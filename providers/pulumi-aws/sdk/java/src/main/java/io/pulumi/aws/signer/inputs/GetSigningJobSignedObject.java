// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.GetSigningJobSignedObjectS3;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class GetSigningJobSignedObject extends io.pulumi.resources.InvokeArgs {

    public static final GetSigningJobSignedObject Empty = new GetSigningJobSignedObject();

    @InputImport(name="s3s", required=true)
      private final List<GetSigningJobSignedObjectS3> s3s;

    public List<GetSigningJobSignedObjectS3> getS3s() {
        return this.s3s;
    }

    public GetSigningJobSignedObject(List<GetSigningJobSignedObjectS3> s3s) {
        this.s3s = Objects.requireNonNull(s3s, "expected parameter 's3s' to be non-null");
    }

    private GetSigningJobSignedObject() {
        this.s3s = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningJobSignedObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSigningJobSignedObjectS3> s3s;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningJobSignedObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3s = defaults.s3s;
        }

        public Builder s3s(List<GetSigningJobSignedObjectS3> s3s) {
            this.s3s = Objects.requireNonNull(s3s);
            return this;
        }
        public GetSigningJobSignedObject build() {
            return new GetSigningJobSignedObject(s3s);
        }
    }
}
