// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resourcegroups.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupConfigurationParameterArgs extends ResourceArgs {

    public static final GroupConfigurationParameterArgs Empty = new GroupConfigurationParameterArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private GroupConfigurationParameterArgs() {}

    private GroupConfigurationParameterArgs(GroupConfigurationParameterArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupConfigurationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupConfigurationParameterArgs $;

        public Builder() {
            $ = new GroupConfigurationParameterArgs();
        }

        public Builder(GroupConfigurationParameterArgs defaults) {
            $ = new GroupConfigurationParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GroupConfigurationParameterArgs build() {
            return $;
        }
    }

}
