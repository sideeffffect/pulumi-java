// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * HttpFilterConfiguration supplies additional contextual settings for networkservices.HttpFilter resources enabled by Traffic Director.
 * 
 */
public final class HttpFilterConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpFilterConfigResponse Empty = new HttpFilterConfigResponse();

    /**
     * The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
     * 
     */
    @Import(name="config", required=true)
    private String config;

    public String config() {
        return this.config;
    }

    /**
     * The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
     * 
     */
    @Import(name="configTypeUrl", required=true)
    private String configTypeUrl;

    public String configTypeUrl() {
        return this.configTypeUrl;
    }

    /**
     * Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
     * 
     */
    @Import(name="filterName", required=true)
    private String filterName;

    public String filterName() {
        return this.filterName;
    }

    private HttpFilterConfigResponse() {}

    private HttpFilterConfigResponse(HttpFilterConfigResponse $) {
        this.config = $.config;
        this.configTypeUrl = $.configTypeUrl;
        this.filterName = $.filterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpFilterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpFilterConfigResponse $;

        public Builder() {
            $ = new HttpFilterConfigResponse();
        }

        public Builder(HttpFilterConfigResponse defaults) {
            $ = new HttpFilterConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder config(String config) {
            $.config = config;
            return this;
        }

        public Builder configTypeUrl(String configTypeUrl) {
            $.configTypeUrl = configTypeUrl;
            return this;
        }

        public Builder filterName(String filterName) {
            $.filterName = filterName;
            return this;
        }

        public HttpFilterConfigResponse build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.configTypeUrl = Objects.requireNonNull($.configTypeUrl, "expected parameter 'configTypeUrl' to be non-null");
            $.filterName = Objects.requireNonNull($.filterName, "expected parameter 'filterName' to be non-null");
            return $;
        }
    }

}
