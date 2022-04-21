// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class GetImageImageTestsConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetImageImageTestsConfiguration Empty = new GetImageImageTestsConfiguration();

    /**
     * Whether image tests are enabled.
     * 
     */
    @Import(name="imageTestsEnabled", required=true)
    private Boolean imageTestsEnabled;

    public Boolean imageTestsEnabled() {
        return this.imageTestsEnabled;
    }

    /**
     * Number of minutes before image tests time out.
     * 
     */
    @Import(name="timeoutMinutes", required=true)
    private Integer timeoutMinutes;

    public Integer timeoutMinutes() {
        return this.timeoutMinutes;
    }

    private GetImageImageTestsConfiguration() {}

    private GetImageImageTestsConfiguration(GetImageImageTestsConfiguration $) {
        this.imageTestsEnabled = $.imageTestsEnabled;
        this.timeoutMinutes = $.timeoutMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageImageTestsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageImageTestsConfiguration $;

        public Builder() {
            $ = new GetImageImageTestsConfiguration();
        }

        public Builder(GetImageImageTestsConfiguration defaults) {
            $ = new GetImageImageTestsConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder imageTestsEnabled(Boolean imageTestsEnabled) {
            $.imageTestsEnabled = imageTestsEnabled;
            return this;
        }

        public Builder timeoutMinutes(Integer timeoutMinutes) {
            $.timeoutMinutes = timeoutMinutes;
            return this;
        }

        public GetImageImageTestsConfiguration build() {
            $.imageTestsEnabled = Objects.requireNonNull($.imageTestsEnabled, "expected parameter 'imageTestsEnabled' to be non-null");
            $.timeoutMinutes = Objects.requireNonNull($.timeoutMinutes, "expected parameter 'timeoutMinutes' to be non-null");
            return $;
        }
    }

}
