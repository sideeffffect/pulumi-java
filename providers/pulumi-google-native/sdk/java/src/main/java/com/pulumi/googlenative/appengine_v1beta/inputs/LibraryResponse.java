// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Third-party Python runtime library that is required by the application.
 * 
 */
public final class LibraryResponse extends com.pulumi.resources.InvokeArgs {

    public static final LibraryResponse Empty = new LibraryResponse();

    /**
     * Name of the library. Example: &#34;django&#34;.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Version of the library to select, or &#34;latest&#34;.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private LibraryResponse() {}

    private LibraryResponse(LibraryResponse $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LibraryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LibraryResponse $;

        public Builder() {
            $ = new LibraryResponse();
        }

        public Builder(LibraryResponse defaults) {
            $ = new LibraryResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public LibraryResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
