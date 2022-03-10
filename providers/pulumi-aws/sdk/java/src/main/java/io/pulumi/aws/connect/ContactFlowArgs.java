// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactFlowArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactFlowArgs Empty = new ContactFlowArgs();

    /**
     * Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    @InputImport(name="contentHash")
      private final @Nullable Input<String> contentHash;

    public Input<String> getContentHash() {
        return this.contentHash == null ? Input.empty() : this.contentHash;
    }

    /**
     * Specifies the description of the Contact Flow.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
     * 
     */
    @InputImport(name="filename")
      private final @Nullable Input<String> filename;

    public Input<String> getFilename() {
        return this.filename == null ? Input.empty() : this.filename;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Specifies the name of the Contact Flow.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Tags to apply to the Contact Flow. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ContactFlowArgs(
        @Nullable Input<String> content,
        @Nullable Input<String> contentHash,
        @Nullable Input<String> description,
        @Nullable Input<String> filename,
        Input<String> instanceId,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> type) {
        this.content = content;
        this.contentHash = contentHash;
        this.description = description;
        this.filename = filename;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.tags = tags;
        this.type = type;
    }

    private ContactFlowArgs() {
        this.content = Input.empty();
        this.contentHash = Input.empty();
        this.description = Input.empty();
        this.filename = Input.empty();
        this.instanceId = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<String> contentHash;
        private @Nullable Input<String> description;
        private @Nullable Input<String> filename;
        private Input<String> instanceId;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactFlowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentHash = defaults.contentHash;
    	      this.description = defaults.description;
    	      this.filename = defaults.filename;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder content(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder contentHash(@Nullable Input<String> contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        public Builder contentHash(@Nullable String contentHash) {
            this.contentHash = Input.ofNullable(contentHash);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder filename(@Nullable Input<String> filename) {
            this.filename = filename;
            return this;
        }

        public Builder filename(@Nullable String filename) {
            this.filename = Input.ofNullable(filename);
            return this;
        }

        public Builder instanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ContactFlowArgs build() {
            return new ContactFlowArgs(content, contentHash, description, filename, instanceId, name, tags, type);
        }
    }
}
