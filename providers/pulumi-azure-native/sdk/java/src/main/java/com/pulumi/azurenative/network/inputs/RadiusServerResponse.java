// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Radius Server Settings.
 * 
 */
public final class RadiusServerResponse extends com.pulumi.resources.InvokeArgs {

    public static final RadiusServerResponse Empty = new RadiusServerResponse();

    /**
     * The address of this radius server.
     * 
     */
    @Import(name="radiusServerAddress", required=true)
    private String radiusServerAddress;

    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * The initial score assigned to this radius server.
     * 
     */
    @Import(name="radiusServerScore")
    private @Nullable Double radiusServerScore;

    public Optional<Double> radiusServerScore() {
        return Optional.ofNullable(this.radiusServerScore);
    }

    /**
     * The secret used for this radius server.
     * 
     */
    @Import(name="radiusServerSecret")
    private @Nullable String radiusServerSecret;

    public Optional<String> radiusServerSecret() {
        return Optional.ofNullable(this.radiusServerSecret);
    }

    private RadiusServerResponse() {}

    private RadiusServerResponse(RadiusServerResponse $) {
        this.radiusServerAddress = $.radiusServerAddress;
        this.radiusServerScore = $.radiusServerScore;
        this.radiusServerSecret = $.radiusServerSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RadiusServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RadiusServerResponse $;

        public Builder() {
            $ = new RadiusServerResponse();
        }

        public Builder(RadiusServerResponse defaults) {
            $ = new RadiusServerResponse(Objects.requireNonNull(defaults));
        }

        public Builder radiusServerAddress(String radiusServerAddress) {
            $.radiusServerAddress = radiusServerAddress;
            return this;
        }

        public Builder radiusServerScore(@Nullable Double radiusServerScore) {
            $.radiusServerScore = radiusServerScore;
            return this;
        }

        public Builder radiusServerSecret(@Nullable String radiusServerSecret) {
            $.radiusServerSecret = radiusServerSecret;
            return this;
        }

        public RadiusServerResponse build() {
            $.radiusServerAddress = Objects.requireNonNull($.radiusServerAddress, "expected parameter 'radiusServerAddress' to be non-null");
            return $;
        }
    }

}
