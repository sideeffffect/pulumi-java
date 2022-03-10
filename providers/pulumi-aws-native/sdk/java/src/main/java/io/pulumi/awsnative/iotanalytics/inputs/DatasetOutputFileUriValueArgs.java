// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatasetOutputFileUriValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetOutputFileUriValueArgs Empty = new DatasetOutputFileUriValueArgs();

    @InputImport(name="fileName", required=true)
      private final Input<String> fileName;

    public Input<String> getFileName() {
        return this.fileName;
    }

    public DatasetOutputFileUriValueArgs(Input<String> fileName) {
        this.fileName = Objects.requireNonNull(fileName, "expected parameter 'fileName' to be non-null");
    }

    private DatasetOutputFileUriValueArgs() {
        this.fileName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetOutputFileUriValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fileName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetOutputFileUriValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
        }

        public Builder fileName(Input<String> fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }

        public Builder fileName(String fileName) {
            this.fileName = Input.of(Objects.requireNonNull(fileName));
            return this;
        }
        public DatasetOutputFileUriValueArgs build() {
            return new DatasetOutputFileUriValueArgs(fileName);
        }
    }
}
