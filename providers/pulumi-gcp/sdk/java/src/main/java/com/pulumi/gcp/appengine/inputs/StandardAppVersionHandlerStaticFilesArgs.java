// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardAppVersionHandlerStaticFilesArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionHandlerStaticFilesArgs Empty = new StandardAppVersionHandlerStaticFilesArgs();

    /**
     * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as
     * static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged
     * against both your code and static data storage resource quotas.
     * 
     */
    @Import(name="applicationReadable")
    private @Nullable Output<Boolean> applicationReadable;

    public Optional<Output<Boolean>> applicationReadable() {
        return Optional.ofNullable(this.applicationReadable);
    }

    /**
     * Time a static file served by this handler should be cached by web proxies and browsers.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example &#34;3.5s&#34;.
     * 
     */
    @Import(name="expiration")
    private @Nullable Output<String> expiration;

    public Optional<Output<String>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * HTTP headers to use for all responses from these URLs.
     * An object containing a list of &#34;key:value&#34; value pairs.&#34;.
     * 
     */
    @Import(name="httpHeaders")
    private @Nullable Output<Map<String,String>> httpHeaders;

    public Optional<Output<Map<String,String>>> httpHeaders() {
        return Optional.ofNullable(this.httpHeaders);
    }

    /**
     * MIME type used to serve all files served by this handler.
     * Defaults to file-specific MIME types, which are derived from each file&#39;s filename extension.
     * 
     */
    @Import(name="mimeType")
    private @Nullable Output<String> mimeType;

    public Optional<Output<String>> mimeType() {
        return Optional.ofNullable(this.mimeType);
    }

    /**
     * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
     */
    @Import(name="requireMatchingFile")
    private @Nullable Output<Boolean> requireMatchingFile;

    public Optional<Output<Boolean>> requireMatchingFile() {
        return Optional.ofNullable(this.requireMatchingFile);
    }

    /**
     * Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
     */
    @Import(name="uploadPathRegex")
    private @Nullable Output<String> uploadPathRegex;

    public Optional<Output<String>> uploadPathRegex() {
        return Optional.ofNullable(this.uploadPathRegex);
    }

    private StandardAppVersionHandlerStaticFilesArgs() {}

    private StandardAppVersionHandlerStaticFilesArgs(StandardAppVersionHandlerStaticFilesArgs $) {
        this.applicationReadable = $.applicationReadable;
        this.expiration = $.expiration;
        this.httpHeaders = $.httpHeaders;
        this.mimeType = $.mimeType;
        this.path = $.path;
        this.requireMatchingFile = $.requireMatchingFile;
        this.uploadPathRegex = $.uploadPathRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardAppVersionHandlerStaticFilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardAppVersionHandlerStaticFilesArgs $;

        public Builder() {
            $ = new StandardAppVersionHandlerStaticFilesArgs();
        }

        public Builder(StandardAppVersionHandlerStaticFilesArgs defaults) {
            $ = new StandardAppVersionHandlerStaticFilesArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationReadable(@Nullable Output<Boolean> applicationReadable) {
            $.applicationReadable = applicationReadable;
            return this;
        }

        public Builder applicationReadable(Boolean applicationReadable) {
            return applicationReadable(Output.of(applicationReadable));
        }

        public Builder expiration(@Nullable Output<String> expiration) {
            $.expiration = expiration;
            return this;
        }

        public Builder expiration(String expiration) {
            return expiration(Output.of(expiration));
        }

        public Builder httpHeaders(@Nullable Output<Map<String,String>> httpHeaders) {
            $.httpHeaders = httpHeaders;
            return this;
        }

        public Builder httpHeaders(Map<String,String> httpHeaders) {
            return httpHeaders(Output.of(httpHeaders));
        }

        public Builder mimeType(@Nullable Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder requireMatchingFile(@Nullable Output<Boolean> requireMatchingFile) {
            $.requireMatchingFile = requireMatchingFile;
            return this;
        }

        public Builder requireMatchingFile(Boolean requireMatchingFile) {
            return requireMatchingFile(Output.of(requireMatchingFile));
        }

        public Builder uploadPathRegex(@Nullable Output<String> uploadPathRegex) {
            $.uploadPathRegex = uploadPathRegex;
            return this;
        }

        public Builder uploadPathRegex(String uploadPathRegex) {
            return uploadPathRegex(Output.of(uploadPathRegex));
        }

        public StandardAppVersionHandlerStaticFilesArgs build() {
            return $;
        }
    }

}
