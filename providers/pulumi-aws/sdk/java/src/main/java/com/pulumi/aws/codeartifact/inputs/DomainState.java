// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainState extends com.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * The ARN of the Domain.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The total size of all assets in the domain.
     * 
     */
    @Import(name="assetSizeBytes")
    private @Nullable Output<Integer> assetSizeBytes;

    public Optional<Output<Integer>> assetSizeBytes() {
        return Optional.ofNullable(this.assetSizeBytes);
    }

    /**
     * A timestamp that represents the date and time the domain was created in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="createdTime")
    private @Nullable Output<String> createdTime;

    public Optional<Output<String>> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }

    /**
     * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name because it is publicly discoverable.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The encryption key for the domain. This is used to encrypt content stored in a domain. The KMS Key Amazon Resource Name (ARN). The default aws/codeartifact AWS KMS master key is used if this element is absent.
     * 
     */
    @Import(name="encryptionKey")
    private @Nullable Output<String> encryptionKey;

    public Optional<Output<String>> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }

    /**
     * The AWS account ID that owns the domain.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * The number of repositories in the domain.
     * 
     */
    @Import(name="repositoryCount")
    private @Nullable Output<Integer> repositoryCount;

    public Optional<Output<Integer>> repositoryCount() {
        return Optional.ofNullable(this.repositoryCount);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private DomainState() {}

    private DomainState(DomainState $) {
        this.arn = $.arn;
        this.assetSizeBytes = $.assetSizeBytes;
        this.createdTime = $.createdTime;
        this.domain = $.domain;
        this.encryptionKey = $.encryptionKey;
        this.owner = $.owner;
        this.repositoryCount = $.repositoryCount;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainState $;

        public Builder() {
            $ = new DomainState();
        }

        public Builder(DomainState defaults) {
            $ = new DomainState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder assetSizeBytes(@Nullable Output<Integer> assetSizeBytes) {
            $.assetSizeBytes = assetSizeBytes;
            return this;
        }

        public Builder assetSizeBytes(Integer assetSizeBytes) {
            return assetSizeBytes(Output.of(assetSizeBytes));
        }

        public Builder createdTime(@Nullable Output<String> createdTime) {
            $.createdTime = createdTime;
            return this;
        }

        public Builder createdTime(String createdTime) {
            return createdTime(Output.of(createdTime));
        }

        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        public Builder encryptionKey(String encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public Builder repositoryCount(@Nullable Output<Integer> repositoryCount) {
            $.repositoryCount = repositoryCount;
            return this;
        }

        public Builder repositoryCount(Integer repositoryCount) {
            return repositoryCount(Output.of(repositoryCount));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public DomainState build() {
            return $;
        }
    }

}
