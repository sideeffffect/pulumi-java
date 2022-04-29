// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeartifact;

import com.pulumi.awsnative.codeartifact.inputs.DomainTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainArgs extends ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * The name of the domain.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The name of the domain.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The access control resource policy on the provided domain.
     * 
     */
    @Import(name="permissionsPolicyDocument")
    private @Nullable Output<Object> permissionsPolicyDocument;

    /**
     * @return The access control resource policy on the provided domain.
     * 
     */
    public Optional<Output<Object>> permissionsPolicyDocument() {
        return Optional.ofNullable(this.permissionsPolicyDocument);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<DomainTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<DomainTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DomainArgs() {}

    private DomainArgs(DomainArgs $) {
        this.domainName = $.domainName;
        this.permissionsPolicyDocument = $.permissionsPolicyDocument;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainArgs $;

        public Builder() {
            $ = new DomainArgs();
        }

        public Builder(DomainArgs defaults) {
            $ = new DomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param permissionsPolicyDocument The access control resource policy on the provided domain.
         * 
         * @return builder
         * 
         */
        public Builder permissionsPolicyDocument(@Nullable Output<Object> permissionsPolicyDocument) {
            $.permissionsPolicyDocument = permissionsPolicyDocument;
            return this;
        }

        /**
         * @param permissionsPolicyDocument The access control resource policy on the provided domain.
         * 
         * @return builder
         * 
         */
        public Builder permissionsPolicyDocument(Object permissionsPolicyDocument) {
            return permissionsPolicyDocument(Output.of(permissionsPolicyDocument));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<DomainTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<DomainTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(DomainTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DomainArgs build() {
            return $;
        }
    }

}
