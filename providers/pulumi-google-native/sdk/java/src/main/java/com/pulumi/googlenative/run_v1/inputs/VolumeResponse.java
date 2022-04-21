// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1.inputs.ConfigMapVolumeSourceResponse;
import com.pulumi.googlenative.run_v1.inputs.SecretVolumeSourceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Volume represents a named volume in a container.
 * 
 */
public final class VolumeResponse extends com.pulumi.resources.InvokeArgs {

    public static final VolumeResponse Empty = new VolumeResponse();

    @Import(name="configMap", required=true)
    private ConfigMapVolumeSourceResponse configMap;

    public ConfigMapVolumeSourceResponse configMap() {
        return this.configMap;
    }

    /**
     * Volume&#39;s name. In Cloud Run Fully Managed, the name &#39;cloudsql&#39; is reserved.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="secret", required=true)
    private SecretVolumeSourceResponse secret;

    public SecretVolumeSourceResponse secret() {
        return this.secret;
    }

    private VolumeResponse() {}

    private VolumeResponse(VolumeResponse $) {
        this.configMap = $.configMap;
        this.name = $.name;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeResponse $;

        public Builder() {
            $ = new VolumeResponse();
        }

        public Builder(VolumeResponse defaults) {
            $ = new VolumeResponse(Objects.requireNonNull(defaults));
        }

        public Builder configMap(ConfigMapVolumeSourceResponse configMap) {
            $.configMap = configMap;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder secret(SecretVolumeSourceResponse secret) {
            $.secret = secret;
            return this;
        }

        public VolumeResponse build() {
            $.configMap = Objects.requireNonNull($.configMap, "expected parameter 'configMap' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}
