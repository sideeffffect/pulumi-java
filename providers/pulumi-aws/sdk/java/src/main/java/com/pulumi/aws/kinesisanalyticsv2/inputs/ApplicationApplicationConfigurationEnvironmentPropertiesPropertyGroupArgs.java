// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs Empty = new ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs();

    /**
     * The key of the application execution property key-value map.
     * 
     */
    @Import(name="propertyGroupId", required=true)
    private Output<String> propertyGroupId;

    public Output<String> propertyGroupId() {
        return this.propertyGroupId;
    }

    /**
     * Application execution property key-value map.
     * 
     */
    @Import(name="propertyMap", required=true)
    private Output<Map<String,String>> propertyMap;

    public Output<Map<String,String>> propertyMap() {
        return this.propertyMap;
    }

    private ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs() {}

    private ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs(ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs $) {
        this.propertyGroupId = $.propertyGroupId;
        this.propertyMap = $.propertyMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs();
        }

        public Builder(ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs defaults) {
            $ = new ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder propertyGroupId(Output<String> propertyGroupId) {
            $.propertyGroupId = propertyGroupId;
            return this;
        }

        public Builder propertyGroupId(String propertyGroupId) {
            return propertyGroupId(Output.of(propertyGroupId));
        }

        public Builder propertyMap(Output<Map<String,String>> propertyMap) {
            $.propertyMap = propertyMap;
            return this;
        }

        public Builder propertyMap(Map<String,String> propertyMap) {
            return propertyMap(Output.of(propertyMap));
        }

        public ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs build() {
            $.propertyGroupId = Objects.requireNonNull($.propertyGroupId, "expected parameter 'propertyGroupId' to be non-null");
            $.propertyMap = Objects.requireNonNull($.propertyMap, "expected parameter 'propertyMap' to be non-null");
            return $;
        }
    }

}
