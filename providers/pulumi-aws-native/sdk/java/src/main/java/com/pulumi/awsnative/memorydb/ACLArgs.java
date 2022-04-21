// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb;

import com.pulumi.awsnative.memorydb.inputs.ACLTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ACLArgs extends com.pulumi.resources.ResourceArgs {

    public static final ACLArgs Empty = new ACLArgs();

    /**
     * The name of the acl.
     * 
     */
    @Import(name="aCLName")
    private @Nullable Output<String> aCLName;

    public Optional<Output<String>> aCLName() {
        return Optional.ofNullable(this.aCLName);
    }

    /**
     * An array of key-value pairs to apply to this cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ACLTagArgs>> tags;

    public Optional<Output<List<ACLTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * List of users associated to this acl.
     * 
     */
    @Import(name="userNames")
    private @Nullable Output<List<String>> userNames;

    public Optional<Output<List<String>>> userNames() {
        return Optional.ofNullable(this.userNames);
    }

    private ACLArgs() {}

    private ACLArgs(ACLArgs $) {
        this.aCLName = $.aCLName;
        this.tags = $.tags;
        this.userNames = $.userNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ACLArgs $;

        public Builder() {
            $ = new ACLArgs();
        }

        public Builder(ACLArgs defaults) {
            $ = new ACLArgs(Objects.requireNonNull(defaults));
        }

        public Builder aCLName(@Nullable Output<String> aCLName) {
            $.aCLName = aCLName;
            return this;
        }

        public Builder aCLName(String aCLName) {
            return aCLName(Output.of(aCLName));
        }

        public Builder tags(@Nullable Output<List<ACLTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ACLTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ACLTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder userNames(@Nullable Output<List<String>> userNames) {
            $.userNames = userNames;
            return this;
        }

        public Builder userNames(List<String> userNames) {
            return userNames(Output.of(userNames));
        }

        public Builder userNames(String... userNames) {
            return userNames(List.of(userNames));
        }

        public ACLArgs build() {
            return $;
        }
    }

}
