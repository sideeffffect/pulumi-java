// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainState extends io.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * The ARN of the Domain.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The total size of all assets in the domain.
     * 
     */
    @Import(name="assetSizeBytes")
      private final @Nullable Output<Integer> assetSizeBytes;

    public Output<Integer> assetSizeBytes() {
        return this.assetSizeBytes == null ? Codegen.empty() : this.assetSizeBytes;
    }

    /**
     * A timestamp that represents the date and time the domain was created in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> createdTime() {
        return this.createdTime == null ? Codegen.empty() : this.createdTime;
    }

    /**
     * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name because it is publicly discoverable.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> domain() {
        return this.domain == null ? Codegen.empty() : this.domain;
    }

    /**
     * The encryption key for the domain. This is used to encrypt content stored in a domain. The KMS Key Amazon Resource Name (ARN). The default aws/codeartifact AWS KMS master key is used if this element is absent.
     * 
     */
    @Import(name="encryptionKey")
      private final @Nullable Output<String> encryptionKey;

    public Output<String> encryptionKey() {
        return this.encryptionKey == null ? Codegen.empty() : this.encryptionKey;
    }

    /**
     * The AWS account ID that owns the domain.
     * 
     */
    @Import(name="owner")
      private final @Nullable Output<String> owner;

    public Output<String> owner() {
        return this.owner == null ? Codegen.empty() : this.owner;
    }

    /**
     * The number of repositories in the domain.
     * 
     */
    @Import(name="repositoryCount")
      private final @Nullable Output<Integer> repositoryCount;

    public Output<Integer> repositoryCount() {
        return this.repositoryCount == null ? Codegen.empty() : this.repositoryCount;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public DomainState(
        @Nullable Output<String> arn,
        @Nullable Output<Integer> assetSizeBytes,
        @Nullable Output<String> createdTime,
        @Nullable Output<String> domain,
        @Nullable Output<String> encryptionKey,
        @Nullable Output<String> owner,
        @Nullable Output<Integer> repositoryCount,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.assetSizeBytes = assetSizeBytes;
        this.createdTime = createdTime;
        this.domain = domain;
        this.encryptionKey = encryptionKey;
        this.owner = owner;
        this.repositoryCount = repositoryCount;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DomainState() {
        this.arn = Codegen.empty();
        this.assetSizeBytes = Codegen.empty();
        this.createdTime = Codegen.empty();
        this.domain = Codegen.empty();
        this.encryptionKey = Codegen.empty();
        this.owner = Codegen.empty();
        this.repositoryCount = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Integer> assetSizeBytes;
        private @Nullable Output<String> createdTime;
        private @Nullable Output<String> domain;
        private @Nullable Output<String> encryptionKey;
        private @Nullable Output<String> owner;
        private @Nullable Output<Integer> repositoryCount;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assetSizeBytes = defaults.assetSizeBytes;
    	      this.createdTime = defaults.createdTime;
    	      this.domain = defaults.domain;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.owner = defaults.owner;
    	      this.repositoryCount = defaults.repositoryCount;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder assetSizeBytes(@Nullable Output<Integer> assetSizeBytes) {
            this.assetSizeBytes = assetSizeBytes;
            return this;
        }
        public Builder assetSizeBytes(@Nullable Integer assetSizeBytes) {
            this.assetSizeBytes = Codegen.ofNullable(assetSizeBytes);
            return this;
        }
        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Codegen.ofNullable(createdTime);
            return this;
        }
        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Codegen.ofNullable(domain);
            return this;
        }
        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder encryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = Codegen.ofNullable(encryptionKey);
            return this;
        }
        public Builder owner(@Nullable Output<String> owner) {
            this.owner = owner;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = Codegen.ofNullable(owner);
            return this;
        }
        public Builder repositoryCount(@Nullable Output<Integer> repositoryCount) {
            this.repositoryCount = repositoryCount;
            return this;
        }
        public Builder repositoryCount(@Nullable Integer repositoryCount) {
            this.repositoryCount = Codegen.ofNullable(repositoryCount);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public DomainState build() {
            return new DomainState(arn, assetSizeBytes, createdTime, domain, encryptionKey, owner, repositoryCount, tags, tagsAll);
        }
    }
}
