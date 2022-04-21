// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * `File` containing source content.
 * 
 */
public final class FileResponse extends com.pulumi.resources.InvokeArgs {

    public static final FileResponse Empty = new FileResponse();

    /**
     * Textual Content.
     * 
     */
    @Import(name="content", required=true)
    private String content;

    public String content() {
        return this.content;
    }

    /**
     * Fingerprint (e.g. github sha) associated with the `File`.
     * 
     */
    @Import(name="fingerprint", required=true)
    private String fingerprint;

    public String fingerprint() {
        return this.fingerprint;
    }

    /**
     * File name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private FileResponse() {}

    private FileResponse(FileResponse $) {
        this.content = $.content;
        this.fingerprint = $.fingerprint;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileResponse $;

        public Builder() {
            $ = new FileResponse();
        }

        public Builder(FileResponse defaults) {
            $ = new FileResponse(Objects.requireNonNull(defaults));
        }

        public Builder content(String content) {
            $.content = content;
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public FileResponse build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.fingerprint = Objects.requireNonNull($.fingerprint, "expected parameter 'fingerprint' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
