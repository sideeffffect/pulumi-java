// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.inputs.PublicDelegatedPrefixPublicDelegatedSubPrefixArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalPublicDelegatedPrefixArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalPublicDelegatedPrefixArgs Empty = new GlobalPublicDelegatedPrefixArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The IPv4 address range, in CIDR format, represented by this public delegated prefix.
     * 
     */
    @Import(name="ipCidrRange")
      private final @Nullable Output<String> ipCidrRange;

    public Output<String> ipCidrRange() {
        return this.ipCidrRange == null ? Codegen.empty() : this.ipCidrRange;
    }

    /**
     * If true, the prefix will be live migrated.
     * 
     */
    @Import(name="isLiveMigration")
      private final @Nullable Output<Boolean> isLiveMigration;

    public Output<Boolean> isLiveMigration() {
        return this.isLiveMigration == null ? Codegen.empty() : this.isLiveMigration;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
     * 
     */
    @Import(name="parentPrefix")
      private final @Nullable Output<String> parentPrefix;

    public Output<String> parentPrefix() {
        return this.parentPrefix == null ? Codegen.empty() : this.parentPrefix;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The list of sub public delegated prefixes that exist for this public delegated prefix.
     * 
     */
    @Import(name="publicDelegatedSubPrefixs")
      private final @Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs;

    public Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs() {
        return this.publicDelegatedSubPrefixs == null ? Codegen.empty() : this.publicDelegatedSubPrefixs;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    public GlobalPublicDelegatedPrefixArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> ipCidrRange,
        @Nullable Output<Boolean> isLiveMigration,
        @Nullable Output<String> name,
        @Nullable Output<String> parentPrefix,
        @Nullable Output<String> project,
        @Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs,
        @Nullable Output<String> requestId) {
        this.description = description;
        this.ipCidrRange = ipCidrRange;
        this.isLiveMigration = isLiveMigration;
        this.name = name;
        this.parentPrefix = parentPrefix;
        this.project = project;
        this.publicDelegatedSubPrefixs = publicDelegatedSubPrefixs;
        this.requestId = requestId;
    }

    private GlobalPublicDelegatedPrefixArgs() {
        this.description = Codegen.empty();
        this.ipCidrRange = Codegen.empty();
        this.isLiveMigration = Codegen.empty();
        this.name = Codegen.empty();
        this.parentPrefix = Codegen.empty();
        this.project = Codegen.empty();
        this.publicDelegatedSubPrefixs = Codegen.empty();
        this.requestId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalPublicDelegatedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> ipCidrRange;
        private @Nullable Output<Boolean> isLiveMigration;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parentPrefix;
        private @Nullable Output<String> project;
        private @Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs;
        private @Nullable Output<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalPublicDelegatedPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isLiveMigration = defaults.isLiveMigration;
    	      this.name = defaults.name;
    	      this.parentPrefix = defaults.parentPrefix;
    	      this.project = defaults.project;
    	      this.publicDelegatedSubPrefixs = defaults.publicDelegatedSubPrefixs;
    	      this.requestId = defaults.requestId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }
        public Builder ipCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Codegen.ofNullable(ipCidrRange);
            return this;
        }
        public Builder isLiveMigration(@Nullable Output<Boolean> isLiveMigration) {
            this.isLiveMigration = isLiveMigration;
            return this;
        }
        public Builder isLiveMigration(@Nullable Boolean isLiveMigration) {
            this.isLiveMigration = Codegen.ofNullable(isLiveMigration);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parentPrefix(@Nullable Output<String> parentPrefix) {
            this.parentPrefix = parentPrefix;
            return this;
        }
        public Builder parentPrefix(@Nullable String parentPrefix) {
            this.parentPrefix = Codegen.ofNullable(parentPrefix);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder publicDelegatedSubPrefixs(@Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs) {
            this.publicDelegatedSubPrefixs = publicDelegatedSubPrefixs;
            return this;
        }
        public Builder publicDelegatedSubPrefixs(@Nullable List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs> publicDelegatedSubPrefixs) {
            this.publicDelegatedSubPrefixs = Codegen.ofNullable(publicDelegatedSubPrefixs);
            return this;
        }
        public Builder publicDelegatedSubPrefixs(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs... publicDelegatedSubPrefixs) {
            return publicDelegatedSubPrefixs(List.of(publicDelegatedSubPrefixs));
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }        public GlobalPublicDelegatedPrefixArgs build() {
            return new GlobalPublicDelegatedPrefixArgs(description, ipCidrRange, isLiveMigration, name, parentPrefix, project, publicDelegatedSubPrefixs, requestId);
        }
    }
}
