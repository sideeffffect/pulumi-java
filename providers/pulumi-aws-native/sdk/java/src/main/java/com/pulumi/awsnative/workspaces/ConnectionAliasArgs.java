// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.workspaces;

import com.pulumi.awsnative.workspaces.inputs.ConnectionAliasTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionAliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionAliasArgs Empty = new ConnectionAliasArgs();

    @Import(name="connectionString", required=true)
    private Output<String> connectionString;

    public Output<String> connectionString() {
        return this.connectionString;
    }

    @Import(name="tags")
    private @Nullable Output<List<ConnectionAliasTagArgs>> tags;

    public Optional<Output<List<ConnectionAliasTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ConnectionAliasArgs() {}

    private ConnectionAliasArgs(ConnectionAliasArgs $) {
        this.connectionString = $.connectionString;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionAliasArgs $;

        public Builder() {
            $ = new ConnectionAliasArgs();
        }

        public Builder(ConnectionAliasArgs defaults) {
            $ = new ConnectionAliasArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionString(Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        public Builder tags(@Nullable Output<List<ConnectionAliasTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ConnectionAliasTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ConnectionAliasTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ConnectionAliasArgs build() {
            $.connectionString = Objects.requireNonNull($.connectionString, "expected parameter 'connectionString' to be non-null");
            return $;
        }
    }

}
