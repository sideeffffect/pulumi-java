// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2;

import com.pulumi.awsnative.wafv2.enums.IPSetIPAddressVersion;
import com.pulumi.awsnative.wafv2.enums.IPSetScope;
import com.pulumi.awsnative.wafv2.inputs.IPSetTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IPSetArgs extends ResourceArgs {

    public static final IPSetArgs Empty = new IPSetArgs();

    /**
     * List of IPAddresses.
     * 
     */
    @Import(name="addresses", required=true)
    private Output<List<String>> addresses;

    /**
     * @return List of IPAddresses.
     * 
     */
    public Output<List<String>> addresses() {
        return this.addresses;
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="iPAddressVersion", required=true)
    private Output<IPSetIPAddressVersion> iPAddressVersion;

    public Output<IPSetIPAddressVersion> iPAddressVersion() {
        return this.iPAddressVersion;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="scope", required=true)
    private Output<IPSetScope> scope;

    public Output<IPSetScope> scope() {
        return this.scope;
    }

    @Import(name="tags")
    private @Nullable Output<List<IPSetTagArgs>> tags;

    public Optional<Output<List<IPSetTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private IPSetArgs() {}

    private IPSetArgs(IPSetArgs $) {
        this.addresses = $.addresses;
        this.description = $.description;
        this.iPAddressVersion = $.iPAddressVersion;
        this.name = $.name;
        this.scope = $.scope;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPSetArgs $;

        public Builder() {
            $ = new IPSetArgs();
        }

        public Builder(IPSetArgs defaults) {
            $ = new IPSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses List of IPAddresses.
         * 
         * @return builder
         * 
         */
        public Builder addresses(Output<List<String>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses List of IPAddresses.
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<String> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses List of IPAddresses.
         * 
         * @return builder
         * 
         */
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder iPAddressVersion(Output<IPSetIPAddressVersion> iPAddressVersion) {
            $.iPAddressVersion = iPAddressVersion;
            return this;
        }

        public Builder iPAddressVersion(IPSetIPAddressVersion iPAddressVersion) {
            return iPAddressVersion(Output.of(iPAddressVersion));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder scope(Output<IPSetScope> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(IPSetScope scope) {
            return scope(Output.of(scope));
        }

        public Builder tags(@Nullable Output<List<IPSetTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<IPSetTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(IPSetTagArgs... tags) {
            return tags(List.of(tags));
        }

        public IPSetArgs build() {
            $.addresses = Objects.requireNonNull($.addresses, "expected parameter 'addresses' to be non-null");
            $.iPAddressVersion = Objects.requireNonNull($.iPAddressVersion, "expected parameter 'iPAddressVersion' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
