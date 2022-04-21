// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.inputs.OptionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Method represents a method of an API interface.
 * 
 */
public final class MethodResponse extends com.pulumi.resources.InvokeArgs {

    public static final MethodResponse Empty = new MethodResponse();

    /**
     * The simple name of this method.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Any metadata attached to the method.
     * 
     */
    @Import(name="options", required=true)
    private List<OptionResponse> options;

    public List<OptionResponse> options() {
        return this.options;
    }

    /**
     * If true, the request is streamed.
     * 
     */
    @Import(name="requestStreaming", required=true)
    private Boolean requestStreaming;

    public Boolean requestStreaming() {
        return this.requestStreaming;
    }

    /**
     * A URL of the input message type.
     * 
     */
    @Import(name="requestTypeUrl", required=true)
    private String requestTypeUrl;

    public String requestTypeUrl() {
        return this.requestTypeUrl;
    }

    /**
     * If true, the response is streamed.
     * 
     */
    @Import(name="responseStreaming", required=true)
    private Boolean responseStreaming;

    public Boolean responseStreaming() {
        return this.responseStreaming;
    }

    /**
     * The URL of the output message type.
     * 
     */
    @Import(name="responseTypeUrl", required=true)
    private String responseTypeUrl;

    public String responseTypeUrl() {
        return this.responseTypeUrl;
    }

    /**
     * The source syntax of this method.
     * 
     */
    @Import(name="syntax", required=true)
    private String syntax;

    public String syntax() {
        return this.syntax;
    }

    private MethodResponse() {}

    private MethodResponse(MethodResponse $) {
        this.name = $.name;
        this.options = $.options;
        this.requestStreaming = $.requestStreaming;
        this.requestTypeUrl = $.requestTypeUrl;
        this.responseStreaming = $.responseStreaming;
        this.responseTypeUrl = $.responseTypeUrl;
        this.syntax = $.syntax;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MethodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MethodResponse $;

        public Builder() {
            $ = new MethodResponse();
        }

        public Builder(MethodResponse defaults) {
            $ = new MethodResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder options(List<OptionResponse> options) {
            $.options = options;
            return this;
        }

        public Builder options(OptionResponse... options) {
            return options(List.of(options));
        }

        public Builder requestStreaming(Boolean requestStreaming) {
            $.requestStreaming = requestStreaming;
            return this;
        }

        public Builder requestTypeUrl(String requestTypeUrl) {
            $.requestTypeUrl = requestTypeUrl;
            return this;
        }

        public Builder responseStreaming(Boolean responseStreaming) {
            $.responseStreaming = responseStreaming;
            return this;
        }

        public Builder responseTypeUrl(String responseTypeUrl) {
            $.responseTypeUrl = responseTypeUrl;
            return this;
        }

        public Builder syntax(String syntax) {
            $.syntax = syntax;
            return this;
        }

        public MethodResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.options = Objects.requireNonNull($.options, "expected parameter 'options' to be non-null");
            $.requestStreaming = Objects.requireNonNull($.requestStreaming, "expected parameter 'requestStreaming' to be non-null");
            $.requestTypeUrl = Objects.requireNonNull($.requestTypeUrl, "expected parameter 'requestTypeUrl' to be non-null");
            $.responseStreaming = Objects.requireNonNull($.responseStreaming, "expected parameter 'responseStreaming' to be non-null");
            $.responseTypeUrl = Objects.requireNonNull($.responseTypeUrl, "expected parameter 'responseTypeUrl' to be non-null");
            $.syntax = Objects.requireNonNull($.syntax, "expected parameter 'syntax' to be non-null");
            return $;
        }
    }

}
