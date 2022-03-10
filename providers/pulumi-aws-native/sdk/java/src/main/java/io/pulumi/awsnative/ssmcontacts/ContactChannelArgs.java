// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts;

import io.pulumi.awsnative.ssmcontacts.enums.ContactChannelChannelType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactChannelArgs Empty = new ContactChannelArgs();

    /**
     * The details that SSM Incident Manager uses when trying to engage the contact channel.
     * 
     */
    @InputImport(name="channelAddress")
      private final @Nullable Input<String> channelAddress;

    public Input<String> getChannelAddress() {
        return this.channelAddress == null ? Input.empty() : this.channelAddress;
    }

    /**
     * The device name. String of 6 to 50 alphabetical, numeric, dash, and underscore characters.
     * 
     */
    @InputImport(name="channelName")
      private final @Nullable Input<String> channelName;

    public Input<String> getChannelName() {
        return this.channelName == null ? Input.empty() : this.channelName;
    }

    /**
     * Device type, which specify notification channel. Currently supported values: “SMS”, “VOICE”, “EMAIL”, “CHATBOT.
     * 
     */
    @InputImport(name="channelType")
      private final @Nullable Input<ContactChannelChannelType> channelType;

    public Input<ContactChannelChannelType> getChannelType() {
        return this.channelType == null ? Input.empty() : this.channelType;
    }

    /**
     * ARN of the contact resource
     * 
     */
    @InputImport(name="contactId")
      private final @Nullable Input<String> contactId;

    public Input<String> getContactId() {
        return this.contactId == null ? Input.empty() : this.contactId;
    }

    /**
     * If you want to activate the channel at a later time, you can choose to defer activation. SSM Incident Manager can't engage your contact channel until it has been activated.
     * 
     */
    @InputImport(name="deferActivation")
      private final @Nullable Input<Boolean> deferActivation;

    public Input<Boolean> getDeferActivation() {
        return this.deferActivation == null ? Input.empty() : this.deferActivation;
    }

    public ContactChannelArgs(
        @Nullable Input<String> channelAddress,
        @Nullable Input<String> channelName,
        @Nullable Input<ContactChannelChannelType> channelType,
        @Nullable Input<String> contactId,
        @Nullable Input<Boolean> deferActivation) {
        this.channelAddress = channelAddress;
        this.channelName = channelName;
        this.channelType = channelType;
        this.contactId = contactId;
        this.deferActivation = deferActivation;
    }

    private ContactChannelArgs() {
        this.channelAddress = Input.empty();
        this.channelName = Input.empty();
        this.channelType = Input.empty();
        this.contactId = Input.empty();
        this.deferActivation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> channelAddress;
        private @Nullable Input<String> channelName;
        private @Nullable Input<ContactChannelChannelType> channelType;
        private @Nullable Input<String> contactId;
        private @Nullable Input<Boolean> deferActivation;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelAddress = defaults.channelAddress;
    	      this.channelName = defaults.channelName;
    	      this.channelType = defaults.channelType;
    	      this.contactId = defaults.contactId;
    	      this.deferActivation = defaults.deferActivation;
        }

        public Builder channelAddress(@Nullable Input<String> channelAddress) {
            this.channelAddress = channelAddress;
            return this;
        }

        public Builder channelAddress(@Nullable String channelAddress) {
            this.channelAddress = Input.ofNullable(channelAddress);
            return this;
        }

        public Builder channelName(@Nullable Input<String> channelName) {
            this.channelName = channelName;
            return this;
        }

        public Builder channelName(@Nullable String channelName) {
            this.channelName = Input.ofNullable(channelName);
            return this;
        }

        public Builder channelType(@Nullable Input<ContactChannelChannelType> channelType) {
            this.channelType = channelType;
            return this;
        }

        public Builder channelType(@Nullable ContactChannelChannelType channelType) {
            this.channelType = Input.ofNullable(channelType);
            return this;
        }

        public Builder contactId(@Nullable Input<String> contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder contactId(@Nullable String contactId) {
            this.contactId = Input.ofNullable(contactId);
            return this;
        }

        public Builder deferActivation(@Nullable Input<Boolean> deferActivation) {
            this.deferActivation = deferActivation;
            return this;
        }

        public Builder deferActivation(@Nullable Boolean deferActivation) {
            this.deferActivation = Input.ofNullable(deferActivation);
            return this;
        }
        public ContactChannelArgs build() {
            return new ContactChannelArgs(channelAddress, channelName, channelType, contactId, deferActivation);
        }
    }
}
