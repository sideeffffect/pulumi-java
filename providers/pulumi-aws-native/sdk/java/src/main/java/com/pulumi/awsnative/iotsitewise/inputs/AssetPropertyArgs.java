// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.awsnative.iotsitewise.enums.AssetPropertyNotificationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The asset property&#39;s definition, alias, and notification state.
 * 
 */
public final class AssetPropertyArgs extends ResourceArgs {

    public static final AssetPropertyArgs Empty = new AssetPropertyArgs();

    /**
     * The property alias that identifies the property.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return The property alias that identifies the property.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * Customer provided ID for property.
     * 
     */
    @Import(name="logicalId", required=true)
    private Output<String> logicalId;

    /**
     * @return Customer provided ID for property.
     * 
     */
    public Output<String> logicalId() {
        return this.logicalId;
    }

    /**
     * The MQTT notification state (ENABLED or DISABLED) for this asset property.
     * 
     */
    @Import(name="notificationState")
    private @Nullable Output<AssetPropertyNotificationState> notificationState;

    /**
     * @return The MQTT notification state (ENABLED or DISABLED) for this asset property.
     * 
     */
    public Optional<Output<AssetPropertyNotificationState>> notificationState() {
        return Optional.ofNullable(this.notificationState);
    }

    private AssetPropertyArgs() {}

    private AssetPropertyArgs(AssetPropertyArgs $) {
        this.alias = $.alias;
        this.logicalId = $.logicalId;
        this.notificationState = $.notificationState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetPropertyArgs $;

        public Builder() {
            $ = new AssetPropertyArgs();
        }

        public Builder(AssetPropertyArgs defaults) {
            $ = new AssetPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias The property alias that identifies the property.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias The property alias that identifies the property.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param logicalId Customer provided ID for property.
         * 
         * @return builder
         * 
         */
        public Builder logicalId(Output<String> logicalId) {
            $.logicalId = logicalId;
            return this;
        }

        /**
         * @param logicalId Customer provided ID for property.
         * 
         * @return builder
         * 
         */
        public Builder logicalId(String logicalId) {
            return logicalId(Output.of(logicalId));
        }

        /**
         * @param notificationState The MQTT notification state (ENABLED or DISABLED) for this asset property.
         * 
         * @return builder
         * 
         */
        public Builder notificationState(@Nullable Output<AssetPropertyNotificationState> notificationState) {
            $.notificationState = notificationState;
            return this;
        }

        /**
         * @param notificationState The MQTT notification state (ENABLED or DISABLED) for this asset property.
         * 
         * @return builder
         * 
         */
        public Builder notificationState(AssetPropertyNotificationState notificationState) {
            return notificationState(Output.of(notificationState));
        }

        public AssetPropertyArgs build() {
            $.logicalId = Objects.requireNonNull($.logicalId, "expected parameter 'logicalId' to be non-null");
            return $;
        }
    }

}
