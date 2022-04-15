// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecGcsDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecGcsDataSourceArgs Empty = new TransferJobTransferSpecGcsDataSourceArgs();

    /**
     * S3 Bucket name.
     * 
     */
    @Import(name="bucketName", required=true)
      private final Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    public TransferJobTransferSpecGcsDataSourceArgs(
        Output<String> bucketName,
        @Nullable Output<String> path) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.path = path;
    }

    private TransferJobTransferSpecGcsDataSourceArgs() {
        this.bucketName = Codegen.empty();
        this.path = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecGcsDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketName;
        private @Nullable Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecGcsDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.path = defaults.path;
        }

        public Builder bucketName(Output<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Output.of(Objects.requireNonNull(bucketName));
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }        public TransferJobTransferSpecGcsDataSourceArgs build() {
            return new TransferJobTransferSpecGcsDataSourceArgs(bucketName, path);
        }
    }
}
