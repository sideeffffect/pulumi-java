// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabricksPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabricksPropertiesArgs Empty = new DatabricksPropertiesArgs();

    /**
     * Databricks access token
     * 
     */
    @Import(name="databricksAccessToken")
    private @Nullable Output<String> databricksAccessToken;

    public Optional<Output<String>> databricksAccessToken() {
        return Optional.ofNullable(this.databricksAccessToken);
    }

    /**
     * Workspace Url
     * 
     */
    @Import(name="workspaceUrl")
    private @Nullable Output<String> workspaceUrl;

    public Optional<Output<String>> workspaceUrl() {
        return Optional.ofNullable(this.workspaceUrl);
    }

    private DatabricksPropertiesArgs() {}

    private DatabricksPropertiesArgs(DatabricksPropertiesArgs $) {
        this.databricksAccessToken = $.databricksAccessToken;
        this.workspaceUrl = $.workspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabricksPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabricksPropertiesArgs $;

        public Builder() {
            $ = new DatabricksPropertiesArgs();
        }

        public Builder(DatabricksPropertiesArgs defaults) {
            $ = new DatabricksPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder databricksAccessToken(@Nullable Output<String> databricksAccessToken) {
            $.databricksAccessToken = databricksAccessToken;
            return this;
        }

        public Builder databricksAccessToken(String databricksAccessToken) {
            return databricksAccessToken(Output.of(databricksAccessToken));
        }

        public Builder workspaceUrl(@Nullable Output<String> workspaceUrl) {
            $.workspaceUrl = workspaceUrl;
            return this;
        }

        public Builder workspaceUrl(String workspaceUrl) {
            return workspaceUrl(Output.of(workspaceUrl));
        }

        public DatabricksPropertiesArgs build() {
            return $;
        }
    }

}
