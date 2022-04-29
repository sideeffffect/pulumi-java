// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxEnvironmentVersionConfigArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxEnvironmentState extends ResourceArgs {

    public static final CxEnvironmentState Empty = new CxEnvironmentState();

    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Agent to create an Environment for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The Agent to create an Environment for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * Update time of this environment. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Update time of this environment. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     * Structure is documented below.
     * 
     */
    @Import(name="versionConfigs")
    private @Nullable Output<List<CxEnvironmentVersionConfigArgs>> versionConfigs;

    /**
     * @return A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CxEnvironmentVersionConfigArgs>>> versionConfigs() {
        return Optional.ofNullable(this.versionConfigs);
    }

    private CxEnvironmentState() {}

    private CxEnvironmentState(CxEnvironmentState $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.name = $.name;
        this.parent = $.parent;
        this.updateTime = $.updateTime;
        this.versionConfigs = $.versionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxEnvironmentState $;

        public Builder() {
            $ = new CxEnvironmentState();
        }

        public Builder(CxEnvironmentState defaults) {
            $ = new CxEnvironmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The human-readable name of the environment (unique in an agent). Limit of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the environment (unique in an agent). Limit of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The Agent to create an Environment for.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The Agent to create an Environment for.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param updateTime Update time of this environment. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
         * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Update time of this environment. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
         * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versionConfigs(@Nullable Output<List<CxEnvironmentVersionConfigArgs>> versionConfigs) {
            $.versionConfigs = versionConfigs;
            return this;
        }

        /**
         * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versionConfigs(List<CxEnvironmentVersionConfigArgs> versionConfigs) {
            return versionConfigs(Output.of(versionConfigs));
        }

        /**
         * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versionConfigs(CxEnvironmentVersionConfigArgs... versionConfigs) {
            return versionConfigs(List.of(versionConfigs));
        }

        public CxEnvironmentState build() {
            return $;
        }
    }

}
