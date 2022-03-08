// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ErrorHandlerResponse {
    /**
     * Error condition this handler applies to.
     * 
     */
    private final String errorCode;
    /**
     * MIME type of file. Defaults to text/html.
     * 
     */
    private final String mimeType;
    /**
     * Static file content to be served for this error.
     * 
     */
    private final String staticFile;

    @OutputCustomType.Constructor({"errorCode","mimeType","staticFile"})
    private ErrorHandlerResponse(
        String errorCode,
        String mimeType,
        String staticFile) {
        this.errorCode = errorCode;
        this.mimeType = mimeType;
        this.staticFile = staticFile;
    }

    /**
     * Error condition this handler applies to.
     * 
    */
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * MIME type of file. Defaults to text/html.
     * 
    */
    public String getMimeType() {
        return this.mimeType;
    }
    /**
     * Static file content to be served for this error.
     * 
    */
    public String getStaticFile() {
        return this.staticFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorCode;
        private String mimeType;
        private String staticFile;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.mimeType = defaults.mimeType;
    	      this.staticFile = defaults.staticFile;
        }

        public Builder setErrorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setMimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }

        public Builder setStaticFile(String staticFile) {
            this.staticFile = Objects.requireNonNull(staticFile);
            return this;
        }
        public ErrorHandlerResponse build() {
            return new ErrorHandlerResponse(errorCode, mimeType, staticFile);
        }
    }
}
