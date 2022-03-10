// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * `SourceContext` represents information about the source of a protobuf element, like the file in which it is defined.
 * 
 */
public final class SourceContextResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceContextResponse Empty = new SourceContextResponse();

    /**
     * The path-qualified name of the .proto file that contained the associated protobuf element. For example: `"google/protobuf/source_context.proto"`.
     * 
     */
    @InputImport(name="fileName", required=true)
      private final String fileName;

    public String getFileName() {
        return this.fileName;
    }

    public SourceContextResponse(String fileName) {
        this.fileName = Objects.requireNonNull(fileName, "expected parameter 'fileName' to be non-null");
    }

    private SourceContextResponse() {
        this.fileName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileName;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
        }

        public Builder fileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }
        public SourceContextResponse build() {
            return new SourceContextResponse(fileName);
        }
    }
}
