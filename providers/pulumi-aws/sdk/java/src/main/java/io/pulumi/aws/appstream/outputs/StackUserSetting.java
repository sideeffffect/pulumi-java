// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StackUserSetting {
    /**
     * Action that is enabled or disabled. Valid values are: `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, `DOMAIN_SMART_CARD_SIGNIN`.
     * 
     */
    private final String action;
    /**
     * Indicates whether the action is enabled or disabled. Valid values are: `ENABLED`, `DISABLED`.
     * 
     */
    private final String permission;

    @OutputCustomType.Constructor
    private StackUserSetting(
        @OutputCustomType.Parameter("action") String action,
        @OutputCustomType.Parameter("permission") String permission) {
        this.action = action;
        this.permission = permission;
    }

    /**
     * Action that is enabled or disabled. Valid values are: `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, `DOMAIN_SMART_CARD_SIGNIN`.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * Indicates whether the action is enabled or disabled. Valid values are: `ENABLED`, `DISABLED`.
     * 
    */
    public String getPermission() {
        return this.permission;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackUserSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String permission;

        public Builder() {
    	      // Empty
        }

        public Builder(StackUserSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.permission = defaults.permission;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder permission(String permission) {
            this.permission = Objects.requireNonNull(permission);
            return this;
        }
        public StackUserSetting build() {
            return new StackUserSetting(action, permission);
        }
    }
}
