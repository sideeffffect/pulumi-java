// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MuteConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MuteConfigArgs Empty = new MuteConfigArgs();

    /**
     * A description of the mute config.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The human readable name to be displayed for the mute config.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * An expression that defines the filter to apply across create/update events of findings. While creating a filter string, be mindful of the scope in which the mute configuration is being created. E.g., If a filter contains project = X but is created under the project = Y scope, it might not match any findings. The following field and operator combinations are supported: * severity: `=`, `:` * category: `=`, `:` * resource.name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.type: `=`, `:` * finding_class: `=`, `:` * indicator.ip_addresses: `=`, `:` * indicator.domains: `=`, `:`
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    @Import(name="muteConfigId", required=true)
    private Output<String> muteConfigId;

    public Output<String> muteConfigId() {
        return this.muteConfigId;
    }

    /**
     * This field will be ignored if provided on config creation. Format &#34;organizations/{organization}/muteConfigs/{mute_config}&#34; &#34;folders/{folder}/muteConfigs/{mute_config}&#34; &#34;projects/{project}/muteConfigs/{mute_config}&#34;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private MuteConfigArgs() {}

    private MuteConfigArgs(MuteConfigArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.filter = $.filter;
        this.muteConfigId = $.muteConfigId;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MuteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MuteConfigArgs $;

        public Builder() {
            $ = new MuteConfigArgs();
        }

        public Builder(MuteConfigArgs defaults) {
            $ = new MuteConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder muteConfigId(Output<String> muteConfigId) {
            $.muteConfigId = muteConfigId;
            return this;
        }

        public Builder muteConfigId(String muteConfigId) {
            return muteConfigId(Output.of(muteConfigId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public MuteConfigArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.muteConfigId = Objects.requireNonNull($.muteConfigId, "expected parameter 'muteConfigId' to be non-null");
            return $;
        }
    }

}
