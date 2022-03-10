// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FunctionFileSystemConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionFileSystemConfigArgs Empty = new FunctionFileSystemConfigArgs();

    /**
     * Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
     * 
     */
    @InputImport(name="arn", required=true)
      private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    /**
     * Path where the function can access the file system, starting with /mnt/.
     * 
     */
    @InputImport(name="localMountPath", required=true)
      private final Input<String> localMountPath;

    public Input<String> getLocalMountPath() {
        return this.localMountPath;
    }

    public FunctionFileSystemConfigArgs(
        Input<String> arn,
        Input<String> localMountPath) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.localMountPath = Objects.requireNonNull(localMountPath, "expected parameter 'localMountPath' to be non-null");
    }

    private FunctionFileSystemConfigArgs() {
        this.arn = Input.empty();
        this.localMountPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionFileSystemConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private Input<String> localMountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionFileSystemConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.localMountPath = defaults.localMountPath;
        }

        public Builder arn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder localMountPath(Input<String> localMountPath) {
            this.localMountPath = Objects.requireNonNull(localMountPath);
            return this;
        }

        public Builder localMountPath(String localMountPath) {
            this.localMountPath = Input.of(Objects.requireNonNull(localMountPath));
            return this;
        }
        public FunctionFileSystemConfigArgs build() {
            return new FunctionFileSystemConfigArgs(arn, localMountPath);
        }
    }
}
