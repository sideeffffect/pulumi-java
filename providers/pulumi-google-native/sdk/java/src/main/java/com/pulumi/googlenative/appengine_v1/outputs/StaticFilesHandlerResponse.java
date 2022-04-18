// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class StaticFilesHandlerResponse {
    /**
     * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
     * 
     */
    private final Boolean applicationReadable;
    /**
     * Time a static file served by this handler should be cached by web proxies and browsers.
     * 
     */
    private final String expiration;
    /**
     * HTTP headers to use for all responses from these URLs.
     * 
     */
    private final Map<String,String> httpHeaders;
    /**
     * MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file's filename extension.
     * 
     */
    private final String mimeType;
    /**
     * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    private final String path;
    /**
     * Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
     */
    private final Boolean requireMatchingFile;
    /**
     * Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
     */
    private final String uploadPathRegex;

    @CustomType.Constructor
    private StaticFilesHandlerResponse(
        @CustomType.Parameter("applicationReadable") Boolean applicationReadable,
        @CustomType.Parameter("expiration") String expiration,
        @CustomType.Parameter("httpHeaders") Map<String,String> httpHeaders,
        @CustomType.Parameter("mimeType") String mimeType,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("requireMatchingFile") Boolean requireMatchingFile,
        @CustomType.Parameter("uploadPathRegex") String uploadPathRegex) {
        this.applicationReadable = applicationReadable;
        this.expiration = expiration;
        this.httpHeaders = httpHeaders;
        this.mimeType = mimeType;
        this.path = path;
        this.requireMatchingFile = requireMatchingFile;
        this.uploadPathRegex = uploadPathRegex;
    }

    /**
     * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
     * 
    */
    public Boolean applicationReadable() {
        return this.applicationReadable;
    }
    /**
     * Time a static file served by this handler should be cached by web proxies and browsers.
     * 
    */
    public String expiration() {
        return this.expiration;
    }
    /**
     * HTTP headers to use for all responses from these URLs.
     * 
    */
    public Map<String,String> httpHeaders() {
        return this.httpHeaders;
    }
    /**
     * MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file's filename extension.
     * 
    */
    public String mimeType() {
        return this.mimeType;
    }
    /**
     * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
     * 
    */
    public String path() {
        return this.path;
    }
    /**
     * Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
    */
    public Boolean requireMatchingFile() {
        return this.requireMatchingFile;
    }
    /**
     * Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
    */
    public String uploadPathRegex() {
        return this.uploadPathRegex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticFilesHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean applicationReadable;
        private String expiration;
        private Map<String,String> httpHeaders;
        private String mimeType;
        private String path;
        private Boolean requireMatchingFile;
        private String uploadPathRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticFilesHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationReadable = defaults.applicationReadable;
    	      this.expiration = defaults.expiration;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.mimeType = defaults.mimeType;
    	      this.path = defaults.path;
    	      this.requireMatchingFile = defaults.requireMatchingFile;
    	      this.uploadPathRegex = defaults.uploadPathRegex;
        }

        public Builder applicationReadable(Boolean applicationReadable) {
            this.applicationReadable = Objects.requireNonNull(applicationReadable);
            return this;
        }
        public Builder expiration(String expiration) {
            this.expiration = Objects.requireNonNull(expiration);
            return this;
        }
        public Builder httpHeaders(Map<String,String> httpHeaders) {
            this.httpHeaders = Objects.requireNonNull(httpHeaders);
            return this;
        }
        public Builder mimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder requireMatchingFile(Boolean requireMatchingFile) {
            this.requireMatchingFile = Objects.requireNonNull(requireMatchingFile);
            return this;
        }
        public Builder uploadPathRegex(String uploadPathRegex) {
            this.uploadPathRegex = Objects.requireNonNull(uploadPathRegex);
            return this;
        }        public StaticFilesHandlerResponse build() {
            return new StaticFilesHandlerResponse(applicationReadable, expiration, httpHeaders, mimeType, path, requireMatchingFile, uploadPathRegex);
        }
    }
}
