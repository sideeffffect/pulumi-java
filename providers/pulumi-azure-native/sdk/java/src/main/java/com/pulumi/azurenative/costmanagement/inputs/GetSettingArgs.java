// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSettingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSettingArgs Empty = new GetSettingArgs();

    /**
     * Name of the setting. Allowed values: myscope
     * 
     */
    @Import(name="settingName", required=true)
    private String settingName;

    public String settingName() {
        return this.settingName;
    }

    private GetSettingArgs() {}

    private GetSettingArgs(GetSettingArgs $) {
        this.settingName = $.settingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSettingArgs $;

        public Builder() {
            $ = new GetSettingArgs();
        }

        public Builder(GetSettingArgs defaults) {
            $ = new GetSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder settingName(String settingName) {
            $.settingName = settingName;
            return this;
        }

        public GetSettingArgs build() {
            $.settingName = Objects.requireNonNull($.settingName, "expected parameter 'settingName' to be non-null");
            return $;
        }
    }

}
